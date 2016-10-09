package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.bGL.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.*;

public class VariableManagerTest {

	VariableManager variableManager;
	Object firstObject = "firstObject";
	Object secondObject = "secondObject";
	Object thirdObject = "thirdObject";

	@Before
	public void setup() {

		variableManager = new VariableManager();

		variableManager.Store(null, "first", firstObject);

		variableManager.Store(firstObject, "second", secondObject);

		variableManager.Store(secondObject, "third", thirdObject);

		variableManager.Store(null, "zero", 0);

		variableManager.Store(firstObject, "one", 1);
		variableManager.Store(secondObject, "two", 2);

	}

	@Test
	public void GetValueUsingNameTest() throws IllegalAccessException {

		int zero = variableManager.GetValue(null, "zero");
		int one = variableManager.GetValue(firstObject, "one");

		assertEquals(0, zero);
		assertEquals(1, one);

	}

	@Test(expected = IllegalAccessException.class)
	public void GetValueUsingInvalidNameTest() throws IllegalAccessException {

		variableManager.GetValue(null, "invalid");
	}

	@Test
	public void GetValueUsingAdditionExpPlusTest()
		 throws IllegalAccessException {

		int value = GetValueUsingAdditionExp(1, 2, "+");
		assertEquals(3, value);
	}

	@Test
	public void GetValueUsingAdditionExpMinusTest()
		 throws IllegalAccessException {

		int value = GetValueUsingAdditionExp(1, 2, "-");
		assertEquals(-1, value);
	}

	@Test
	public void GetValueUsingMultiplicationExpStarTest()
		 throws IllegalAccessException {

		int value = GetValueUsingMultiplicationExp(6, 3, "*");
		assertEquals(18, value);
	}

	@Test
	public void GetValueUsingMultiplicationExpSlashTest()
		 throws IllegalAccessException {

		int value = GetValueUsingMultiplicationExp(6, 3, "/");
		assertEquals(2, value);
	}

	@Test
	public void GetValueUsingAttributeOrIntReturnsIntTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

		when(attributeOrInt.getAttribute()).thenReturn(null);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference = variableManager.GetReference(attributeOrInt);

		assertEquals(5, reference);
	}

	@Test
	public void GetValueUsingAttributeOrIntReturnsAttributeTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);
		AttributeName firstAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("zero");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference = variableManager.calculate(attributeOrInt);

		assertEquals(0, reference);
		assertNotSame(5, reference);
	}

	@Test(expected = IllegalAccessException.class)
	public void GetValueUsingAttributeOrIntReturnsInvalidAttributeTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);
		AttributeName firstAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		variableManager.calculate(attributeOrInt);

	}

	@Test
	public void GetValueUsingInvalidAttributeOrIntTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

		Object reference = variableManager.calculate(attributeOrInt);
		assertEquals(reference, 0);
	}

	@Test
	public void StoreUsingNameStringTest() throws IllegalAccessException {

		Object object=new Object();
		variableManager.Store(null, "newName",object);

		assertEquals(object,variableManager.GetReference(null, "newName"));
	}

	@Test
	public void StoreUsingPathTest() throws IllegalAccessException {
Object object=new Object();
		List<String> path = Arrays.asList("first", "second", "third", "fourth");
		variableManager.Store(path, object);

		assertEquals(object,variableManager.getReference(path));
	}

	@Test(expected = IllegalAccessException.class)
	public void StoreUsingInvalidPathTest() throws IllegalAccessException {

		List<String> path = new ArrayList<>();
		path.add("first");
		path.add("second");
		path.add("invalid");
		path.add("fourth");

		Object object = new Object();
		variableManager.Store(path, object);
		assertEquals(object, variableManager.getReference(path));

	}

	@Test
	public void EvaluateBooleanExpTest() throws IllegalAccessException {

		AttributeOrInt attributeOrInt5 = mock(AttributeOrInt.class);
		AttributeOrInt attributeOrInt6 = mock(AttributeOrInt.class);
		AttributeOrInt attributeOrIntObject1 = mock(AttributeOrInt.class);
		AttributeOrInt attributeOrIntObject2 = mock(AttributeOrInt.class);
		AttributeName attributeName1 = mock(AttributeName.class);
		AttributeName attributeName2 = mock(AttributeName.class);

		when(attributeOrInt5.getValue()).thenReturn(5);
		when(attributeOrInt6.getValue()).thenReturn(6);
		when(attributeOrIntObject1.getAttribute()).thenReturn(attributeName1);
		when(attributeOrIntObject2.getAttribute()).thenReturn(attributeName2);
		when(attributeName1.getName()).thenReturn("first");
		when(attributeName2.getName()).thenReturn("zero");

		assertTrue(EvaluateBooleanExp(null, attributeOrInt5, "<",
			 attributeOrInt6));
		assertFalse(
			 EvaluateBooleanExp(null, attributeOrInt6, "<", attributeOrInt5));
		assertFalse(
			 EvaluateBooleanExp(null, attributeOrInt6, "<", attributeOrInt6));

		assertTrue(EvaluateBooleanExp(null, attributeOrInt6, ">",
			 attributeOrInt5));
		assertFalse(EvaluateBooleanExp(null, attributeOrInt5, ">",
			 attributeOrInt6));
		assertFalse(EvaluateBooleanExp(null, attributeOrInt6, ">",
			 attributeOrInt6));

		assertTrue(
			 EvaluateBooleanExp(null, attributeOrInt5, "<=", attributeOrInt6));
		assertFalse(
			 EvaluateBooleanExp(null, attributeOrInt6, "<=", attributeOrInt5));
		assertTrue(
			 EvaluateBooleanExp(null, attributeOrInt6, "<=", attributeOrInt6));

		assertFalse(
			 EvaluateBooleanExp(null, attributeOrInt5, ">=", attributeOrInt6));
		assertTrue(
			 EvaluateBooleanExp(null, attributeOrInt6, ">=", attributeOrInt5));
		assertTrue(
			 EvaluateBooleanExp(null, attributeOrInt6, ">=", attributeOrInt6));

		assertTrue(
			 EvaluateBooleanExp(null, attributeOrInt5, "==", attributeOrInt5));
		assertFalse(
			 EvaluateBooleanExp(null, attributeOrInt5, "==", attributeOrInt6));

		assertTrue(EvaluateBooleanExp(null, attributeOrIntObject1, "===",
			 attributeOrIntObject1));
		assertFalse(EvaluateBooleanExp(null, attributeOrIntObject1, "===",
			 attributeOrIntObject2));

		assertFalse(EvaluateBooleanExp(null, attributeOrIntObject1, "!==",
			 attributeOrIntObject1));
		assertTrue(EvaluateBooleanExp(null, attributeOrIntObject1, "!==",
			 attributeOrIntObject2));

		assertTrue(
			 EvaluateBooleanExp("NOT", attributeOrInt6, "<", attributeOrInt5));
	}

	@Test
	public void EvaluateAndExpTest() throws IllegalAccessException {

		assertTrue(EvaluateAndExp(true, true));
		assertFalse(EvaluateAndExp(false, true));
		assertFalse(EvaluateAndExp(true, false));
		assertFalse(EvaluateAndExp(false, false));
	}

	@Test
	public void EvaluateOrExpTest() throws IllegalAccessException {

		assertTrue(EvaluateOrExp(true, true));
		assertTrue(EvaluateOrExp(true, false));
		assertTrue(EvaluateOrExp(false, true));
		assertFalse(EvaluateOrExp(false, false));
	}

	@Test
	public void getVariablePathTest() {

		AttributeName firstAttribute = mock(AttributeName.class);
		AttributeName secondAttribute = mock(AttributeName.class);
		AttributeName thirdAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(secondAttribute);
		when(secondAttribute.getName()).thenReturn("second");
		when(secondAttribute.getChild()).thenReturn(thirdAttribute);
		when(thirdAttribute.getName()).thenReturn("third");
		when(thirdAttribute.getChild()).thenReturn(null);

		List<String> path = variableManager.getVariablePath(firstAttribute);

		assertEquals(3, path.size());
		assertEquals("first", path.get(0));
		assertEquals("second", path.get(1));
		assertEquals("third", path.get(2));
	}

	@Test
	public void GetReferenceUsingPathTest() throws IllegalAccessException {

		List<String> path = new ArrayList<>();
		path.add("first");
		path.add("second");
		path.add("third");
		Object reference = variableManager.getReference(path);
		assertEquals(thirdObject, reference);
	}

	@Test(expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidPathTest()
		 throws IllegalAccessException {

		List<String> path = new ArrayList<>();
		path.add("invalid");
		path.add("second");
		path.add("third");
		Object reference = variableManager.getReference(path);
		assertEquals(thirdObject, reference);
	}

	@Test
	public void GetReferenceUsingNameTest() throws IllegalAccessException {

		Object first = variableManager.GetReference(null, "first");
		Object second = variableManager.GetReference(firstObject, "second");
		assertEquals(firstObject, first);
		assertEquals(secondObject, second);
	}

	@Test(expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidNameTest()
		 throws IllegalAccessException {

		variableManager.GetReference(null, "invalid");
	}

	@Test
	public void GetReferenceUsingAttributeNameTest()
		 throws IllegalAccessException {

		AttributeName firstAttribute = mock(AttributeName.class);
		AttributeName secondAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(secondAttribute);
		when(secondAttribute.getName()).thenReturn("second");
		when(secondAttribute.getChild()).thenReturn(null);

		Object reference = variableManager.GetReference(firstAttribute);

		assertEquals(secondObject, reference);
	}

//GetReference tests

	@Test(expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidAttributeNameTest()
		 throws IllegalAccessException {

		AttributeName firstAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("invalid");
		when(firstAttribute.getChild()).thenReturn(null);

		variableManager.GetReference(firstAttribute);
	}

	@Test
	public void GetReferenceUsingAttributeOrIntReturnsIntTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

		when(attributeOrInt.getAttribute()).thenReturn(null);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference = variableManager.GetReference(attributeOrInt);

		assertEquals(5, reference);
	}

	@Test
	public void GetReferenceUsingAttributeOrIntReturnsAttributeTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);
		AttributeName firstAttribute = mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference = variableManager.GetReference(attributeOrInt);

		assertEquals(firstObject, reference);
		assertNotSame(5, reference);
	}

	@Test
	public void GetReferenceUsingInvalidAttributeOrIntTest()
		 throws IllegalAccessException {

		AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

		Object reference = variableManager.GetReference(attributeOrInt);
		assertEquals(0, reference);
	}

	private int GetValueUsingAdditionExp(int value1, int value2, String operator)
		 throws IllegalAccessException {

		VariableManager spy = spy(variableManager);
		AdditionExp additionExp = mock(AdditionExp.class);
		MultiplicationExp multiplicationExp1 = mock(MultiplicationExp.class);
		MultiplicationExp multiplicationExp2 = mock(MultiplicationExp.class);

		EList<MultiplicationExp> multiplicationExps =
			 new BasicEList<>(Arrays.asList(
				  multiplicationExp1, multiplicationExp2));
		EList<String> operators =
			 new BasicEList<>(Arrays.asList(
				  operator));

		when(additionExp.getExpressions()).thenReturn(multiplicationExps);
		when(additionExp.getOperators()).thenReturn(operators);
		doReturn(value1).when(spy).calculate(multiplicationExp1);
		doReturn(value2).when(spy).calculate(multiplicationExp2);

		return spy.calculate(additionExp);
	}

	private int GetValueUsingMultiplicationExp(
		 int value1, int value2, String operator) throws IllegalAccessException {

		VariableManager spy = spy(variableManager);

		MultiplicationExp multiplicationExp = mock(MultiplicationExp.class);
		AttributeOrInt attributeOrInt1 = mock(AttributeOrInt.class);
		AttributeOrInt attributeOrInt2 = mock(AttributeOrInt.class);
		EList<AttributeOrInt> attributeOrInts =
			 new BasicEList<>(Arrays.asList(
				  attributeOrInt1, attributeOrInt2));
		EList<String> operators =
			 new BasicEList<>(Arrays.asList(
				  operator));

		when(multiplicationExp.getExpressions()).thenReturn(attributeOrInts);
		when(multiplicationExp.getOperators()).thenReturn(operators);
		doReturn(value1).when(spy).calculate(attributeOrInt1);
		doReturn(value2).when(spy).calculate(attributeOrInt2);

		return spy.calculate(multiplicationExp);
	}

	private boolean EvaluateBooleanExp(
		 String not, AttributeOrInt left, String operator, AttributeOrInt right)
		 throws IllegalAccessException {

		BooleanExp booleanExp = mock(BooleanExp.class);

		when(booleanExp.getNot()).thenReturn(not);
		when(booleanExp.getName()).thenReturn(operator);
		when(booleanExp.getLeft()).thenReturn(left);
		when(booleanExp.getRight()).thenReturn(right);

		return variableManager.Evaluate(booleanExp);
	}

	private boolean EvaluateAndExp(boolean left, boolean right)
		 throws IllegalAccessException {

		VariableManager spy = spy(variableManager);

		BooleanExp booleanExp1 = mock(BooleanExp.class);
		BooleanExp booleanExp2 = mock(BooleanExp.class);
		AndExp andExp = mock(AndExp.class);
		EList<BooleanExp> booleanExps =
			 new BasicEList<>(Arrays.asList(booleanExp1, booleanExp2));

		when(andExp.getExpressions()).thenReturn(booleanExps);

		doReturn(left).when(spy).Evaluate(booleanExp1);
		doReturn(right).when(spy).Evaluate(booleanExp2);

		return spy.Evaluate(andExp);
	}

	private boolean EvaluateOrExp(boolean left, boolean right)
		 throws IllegalAccessException {

		VariableManager spy = spy(variableManager);

		OrExp orExp = mock(OrExp.class);
		AndExp andExp1 = mock(AndExp.class);
		AndExp andExp2 = mock(AndExp.class);
		EList<AndExp> andExps = new BasicEList<>(Arrays.asList(andExp1, andExp2));

		when(orExp.getExpressions()).thenReturn(andExps);

		doReturn(left).when(spy).Evaluate(andExp1);
		doReturn(right).when(spy).Evaluate(andExp2);

		return spy.Evaluate(orExp);
	}

}