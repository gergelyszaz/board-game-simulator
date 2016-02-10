package hu.bme.aut.gergelyszaz.BGS.manager;

import com.google.inject.Injector;
import hu.bme.aut.gergelyszaz.BGLStandaloneSetup;
import hu.bme.aut.gergelyszaz.bGL.Model;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ModelManager {
	private static XtextResourceSet resourceSet;
	
	private Hashtable<String, Model> models=new Hashtable<String, Model>();

	public void Initialize() {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new BGLStandaloneSetup().createInjectorAndDoEMFRegistration();
		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}
	
	public List<String> AvailableModels()
	{
		List<String> availabelModels=new ArrayList<String>();
		for(Model m:models.values()){
			availabelModels.add(m.getName());
		}
		return availabelModels;
	}

	public void LoadModel(String input) throws Exception
	{
		String path = /*"platform://" +*/ input.replace("\\", "//");
		System.out.println(path=ModelManager.class.getResource(path).toString());
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		
		Model model = (Model) resource.getContents().get(0);
		if(models.contains(model.getName())) throw new Exception("Language with this name already loaded.");
		models.put(model.getName(),model);
	}
	
	public Model Get(String name) throws Exception
	{
		Model m=models.get(name);
		if(m==null) throw new Exception("Game "+name+" not found!");
		return models.get(name);
		
	}
}
