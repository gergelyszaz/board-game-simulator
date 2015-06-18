package hu.bme.aut.gergelyszaz.BGS;

import hu.bme.aut.gergelyszaz.BGLStandaloneSetup;
import hu.bme.aut.gergelyszaz.BGS.core.Game;
import hu.bme.aut.gergelyszaz.BGS.factory.GameFactory;
import hu.bme.aut.gergelyszaz.bGL.Model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class BGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new BGLStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector
				.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(args[0]),
				true);
		Model model = (Model) resource.getContents().get(0);

		new GameFactory().CreateGame(model).Run();
	}

}
