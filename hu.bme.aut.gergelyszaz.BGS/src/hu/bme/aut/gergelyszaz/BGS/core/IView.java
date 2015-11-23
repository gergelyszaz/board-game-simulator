package hu.bme.aut.gergelyszaz.BGS.core;

import java.util.List;

import hu.bme.aut.gergelyszaz.bGL.Model;

public interface IView {
	public void AddToken(Token token);
	public void RemoveButton(Object object);
	public void SetModel(Model model);
	public void SetController(IController controller);
	public void Refresh();
	public void EnableButtons(List<Object> objects);
}
