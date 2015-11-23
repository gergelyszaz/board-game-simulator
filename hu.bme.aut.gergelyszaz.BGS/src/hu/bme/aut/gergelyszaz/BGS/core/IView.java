package hu.bme.aut.gergelyszaz.BGS.core;

import java.util.List;

import hu.bme.aut.gergelyszaz.bGL.Field;
import hu.bme.aut.gergelyszaz.bGL.Model;

public interface IView {
	public void AddToken(Token token);
	public void RemoveToken(Token token);
	public void SetModel(Model model);
	public void SetController(IController controller);
	public void Refresh();
	public void EnableTokens(List<Token> tokens);
	public void EnableFields(List<Field> fields);
}
