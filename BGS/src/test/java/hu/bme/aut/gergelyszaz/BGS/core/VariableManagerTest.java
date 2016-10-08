package hu.bme.aut.gergelyszaz.BGS.core;

import hu.bme.aut.gergelyszaz.bGL.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VariableManagerTest {
	VariableManager variableManager;
	Object firstObject ="firstObject";
	Object secondObject ="secondObject";
	Object thirdObject ="thirdObject";


	@Before
	public void setup() {
		variableManager = new VariableManager();

		variableManager.Store(null,"first", firstObject);

		variableManager.Store(firstObject,"second", secondObject);

		variableManager.Store(secondObject,"third", thirdObject);

		variableManager.Store(null,"zero", 0);

		variableManager.Store(firstObject,"one", 1);
		variableManager.Store(secondObject,"two", 2);

	}

	@Test
	public void GetValueUsingNameTest() throws IllegalAccessException {
		int zero=variableManager.GetValue(null,"zero");
		int one=variableManager.GetValue(firstObject,"one");

		assertEquals(0,zero);
		assertEquals(1,one);

	}

	@Test (expected = IllegalAccessException.class)
	public void GetValueUsingInvalidNameTest() throws IllegalAccessException {
		variableManager.GetValue(null,"invalid");
	}

	@Test
	public void GetValueUsingAdditionExpPlusTest() throws IllegalAccessException {
		int value=GetValueUsingAdditionExp(1,2,"+");
		assertEquals(3,value);
	}

	@Test
	public void GetValueUsingAdditionExpMinusTest() throws IllegalAccessException {
		int value=GetValueUsingAdditionExp(1,2,"-");
		assertEquals(-1,value);
	}

	private int GetValueUsingAdditionExp(int value1,int value2,String operator) throws IllegalAccessException {
		AdditionExp additionExp=mock(AdditionExp.class);
		MultiplicationExp multiplicationExp1=mock(MultiplicationExp.class);
		MultiplicationExp multiplicationExp2=mock(MultiplicationExp.class);
		AttributeOrInt attributeOrInt1=mock(AttributeOrInt.class);
		AttributeOrInt attributeOrInt2=mock(AttributeOrInt.class);

		EList<MultiplicationExp> multiplicationExps=
						new BasicEList<>(Arrays.asList(
										multiplicationExp1,multiplicationExp2));
		EList<AttributeOrInt> attributeOrInts1=
						new BasicEList<>(Arrays.asList(
										attributeOrInt1));
		EList<AttributeOrInt> attributeOrInts2=
						new BasicEList<>(Arrays.asList(
										attributeOrInt2));
		EList<String> operators=
						new BasicEList<>(Arrays.asList(
										operator));

		when(attributeOrInt1.getValue()).thenReturn(value1);
		when(attributeOrInt2.getValue()).thenReturn(value2);
		when(multiplicationExp1.getExpressions()).thenReturn(attributeOrInts1);
		when(multiplicationExp1.getExpressions()).thenReturn(attributeOrInts2);
		when(additionExp.getExpressions()).thenReturn(multiplicationExps);
		when(additionExp.getOperators()).thenReturn(operators);

		return variableManager.GetValue(additionExp);
	}

	@Test
	public void GetValueUsingMultiplicationExpStarTest() throws IllegalAccessException {
		int value=GetValueUsingMultiplicationExp(6,3,"*");
		assertEquals(18,value);
	}

	@Test
	public void GetValueUsingMultiplicationExpSlashTest() throws IllegalAccessException {
		int value=GetValueUsingMultiplicationExp(6,3,"/");
		assertEquals(2,value);
	}

	private int GetValueUsingMultiplicationExp(
					int value1,int value2,String operator) throws IllegalAccessException {
		MultiplicationExp multiplicationExp=mock(MultiplicationExp.class);
		AttributeOrInt attributeOrInt1=mock(AttributeOrInt.class);
		AttributeOrInt attributeOrInt2=mock(AttributeOrInt.class);
		EList<AttributeOrInt> attributeOrInts=
						new BasicEList<>(Arrays.asList(
										attributeOrInt1,attributeOrInt2));
		EList<String> operators=
						new BasicEList<>(Arrays.asList(
										operator));

		when(attributeOrInt1.getValue()).thenReturn(value1);
		when(attributeOrInt2.getValue()).thenReturn(value2);
		when(multiplicationExp.getExpressions()).thenReturn(attributeOrInts);
		when(multiplicationExp.getOperators()).thenReturn(operators);

		return variableManager.GetValue(multiplicationExp);
	}

	@Test
	public void GetValueUsingAttributeOrIntReturnsIntTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);

		when(attributeOrInt.getAttribute()).thenReturn(null);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference=variableManager.GetReference(attributeOrInt);

		assertEquals(5,reference);
	}

	@Test
	public void GetValueUsingAttributeOrIntReturnsAttributeTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);
		AttributeName firstAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("zero");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference=variableManager.GetValue(attributeOrInt);

		assertEquals(0,reference);
		assertNotSame(5,reference);
	}

	@Test (expected = IllegalAccessException.class)
	public void GetValueUsingAttributeOrIntReturnsInvalidAttributeTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);
		AttributeName firstAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		variableManager.GetValue(attributeOrInt);

	}

	@Test
	public void GetValueUsingInvalidAttributeOrIntTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);

		Object reference=variableManager.GetValue(attributeOrInt);
		assertEquals(reference,0);
	}

	@Test
	public void StoreUsingNameStringTest() {
		variableManager.Store(null,"newName",new Object());
	}

	@Test
	public void StoreUsingPathTest() throws IllegalAccessException {
		List<String> path= Arrays.asList("first","second","third","fourth");

		variableManager.Store(path,new Object());
	}

	@Test (expected = IllegalAccessException.class)
	public void StoreUsingInvalidPathTest() throws IllegalAccessException {
		List<String> path=new ArrayList<>();
		path.add("first");
		path.add("second");
		path.add("invalid");
		path.add("fourth");
		variableManager.Store(path,new Object());
	}

	@Test
	public void EvaluateBooleanExpTest() {
		BooleanExp booleanExp= mock(BooleanExp.class);

		assertTrue(false);
	}

	@Test
	public void EvaluateAndExpTest() {
		assertTrue(false);
	}

	@Test
	public void EvaluateOrExpTest() {
		assertTrue(false);
	}

	@Test
	public void getVariablePathTest() {
		AttributeName firstAttribute=mock(AttributeName.class);
		AttributeName secondAttribute=mock(AttributeName.class);
		AttributeName thirdAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(secondAttribute);
		when(secondAttribute.getName()).thenReturn("second");
		when(secondAttribute.getChild()).thenReturn(thirdAttribute);
		when(thirdAttribute.getName()).thenReturn("third");
		when(thirdAttribute.getChild()).thenReturn(null);

		List<String> path=variableManager.getVariablePath(firstAttribute);

		assertEquals(3,path.size());
		assertEquals("first",path.get(0));
		assertEquals("second",path.get(1));
		assertEquals("third",path.get(2));
	}

//GetReference tests

	@Test
	public void GetReferenceUsingPathTest() throws IllegalAccessException {
		List<String> path=new ArrayList<>();
		path.add("first");
		path.add("second");
		path.add("third");
		Object reference=variableManager.getReference(path);
		assertEquals(thirdObject,reference);
	}

	@Test (expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidPathTest() throws IllegalAccessException {
		List<String> path=new ArrayList<>();
		path.add("invalid");
		path.add("second");
		path.add("third");
		Object reference=variableManager.getReference(path);
		assertEquals(thirdObject,reference);
	}

	@Test
	public void GetReferenceUsingNameTest() throws IllegalAccessException {
		Object first=variableManager.GetReference(null,"first");
		Object second=variableManager.GetReference(firstObject,"second");
		assertEquals(firstObject,first);
		assertEquals(secondObject,second);
	}

	@Test (expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidNameTest() throws IllegalAccessException {
		variableManager.GetReference(null,"invalid");
	}

	@Test
	public void GetReferenceUsingAttributeNameTest()
					throws IllegalAccessException {

		AttributeName firstAttribute=mock(AttributeName.class);
		AttributeName secondAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(secondAttribute);
		when(secondAttribute.getName()).thenReturn("second");
		when(secondAttribute.getChild()).thenReturn(null);

		Object reference=variableManager.GetReference(firstAttribute);

		assertEquals(secondObject,reference);
	}

	@Test (expected = IllegalAccessException.class)
	public void GetReferenceUsingInvalidAttributeNameTest()
					throws IllegalAccessException {

		AttributeName firstAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("invalid");
		when(firstAttribute.getChild()).thenReturn(null);

		variableManager.GetReference(firstAttribute);
	}

	@Test
	public void GetReferenceUsingAttributeOrIntReturnsIntTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);

		when(attributeOrInt.getAttribute()).thenReturn(null);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference=variableManager.GetReference(attributeOrInt);

		assertEquals(5,reference);
	}

	@Test
	public void GetReferenceUsingAttributeOrIntReturnsAttributeTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);
		AttributeName firstAttribute=mock(AttributeName.class);

		when(firstAttribute.getName()).thenReturn("first");
		when(firstAttribute.getChild()).thenReturn(null);
		when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
		when(attributeOrInt.getValue()).thenReturn(5);

		Object reference=variableManager.GetReference(attributeOrInt);

		assertEquals(firstObject,reference);
		assertNotSame(5,reference);
	}

	@Test
	public void GetReferenceUsingInvalidAttributeOrIntTest()
					throws IllegalAccessException {
		AttributeOrInt attributeOrInt=mock(AttributeOrInt.class);

		Object reference=variableManager.GetReference(attributeOrInt);
		assertEquals(0,reference);
	}

}