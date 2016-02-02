package hu.bme.aut.gergelyszaz;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import hu.bme.aut.gergelyszaz.bGL.Model;

public class ModelManager {
	private static XtextResourceSet resourceSet;
	private static Properties configFile = new Properties();
	private Hashtable<String, Model> models=new Hashtable<String, Model>();

	public void Initialize() {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new BGLStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		try {
			configFile.load(ModelManager.class.getClassLoader().getResourceAsStream("games.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void LoadAllModels()
	{
		for(Object k:configFile.values())
		{
			LoadModel((String)k);
		}
	}

	public void LoadModel(String input)
	{
		String path = "file://" + input.replace("\\", "//");
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		
		Model model = (Model) resource.getContents().get(0);
		if(models.contains(model.getName())) throw new RuntimeException("Language with this name already loaded.");
		models.put(model.getName(),model);
	}
	
	public Model Get(String name)
	{
		Model m=models.get(name);
		if(m==null) throw new RuntimeException("Game "+name+" not found!");
		return models.get(name);
		
	}
}
