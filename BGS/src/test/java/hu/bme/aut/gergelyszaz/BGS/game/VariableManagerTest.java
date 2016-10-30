package hu.bme.aut.gergelyszaz.BGS.game;

import hu.bme.aut.gergelyszaz.bGL.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class VariableManagerTest {

    VariableManager variableManager;
    Object firstObject = "firstObject";
    Object secondObject = "secondObject";
    Object thirdObject = "thirdObject";

    @Before
    public void setup() {

        variableManager = new VariableManager();

        variableManager.store(null, "first", firstObject);

        variableManager.store(firstObject, "second", secondObject);

        variableManager.store(secondObject, "third", thirdObject);

        variableManager.store(null, "zero", 0);

        variableManager.store(firstObject, "one", 1);
        variableManager.store(secondObject, "two", 2);

    }

    @Test
    public void GetValueUsingNameTest() {

        int zero = variableManager.getValue(null, "zero");
        int one = variableManager.getValue(firstObject, "one");

        assertEquals(0, zero);
        assertEquals(1, one);

    }

    @Test(expected = IllegalAccessError.class)
    public void GetValueUsingInvalidNameTest() {

        variableManager.getValue(null, "invalid");
    }

    @Test
    public void GetValueUsingAdditionExpPlusTest() {

        int value = GetValueUsingAdditionExp(1, 2, "+");
        assertEquals(3, value);
    }

    @Test
    public void GetValueUsingAdditionExpMinusTest() {

        int value = GetValueUsingAdditionExp(1, 2, "-");
        assertEquals(-1, value);
    }

    @Test
    public void GetValueUsingMultiplicationExpStarTest() {

        int value = GetValueUsingMultiplicationExp(6, 3, "*");
        assertEquals(18, value);
    }

    @Test
    public void GetValueUsingMultiplicationExpSlashTest() {

        int value = GetValueUsingMultiplicationExp(6, 3, "/");
        assertEquals(2, value);
    }

    @Test
    public void GetValueUsingAttributeOrIntReturnsIntTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

        when(attributeOrInt.getAttribute()).thenReturn(null);
        when(attributeOrInt.getValue()).thenReturn(5);

        Object reference = variableManager.getReference(attributeOrInt);

        assertEquals(5, reference);
    }

    @Test
    public void GetValueUsingAttributeOrIntReturnsAttributeTest() {

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

    @Test(expected = IllegalAccessError.class)
    public void GetValueUsingAttributeOrIntReturnsInvalidAttributeTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);
        AttributeName firstAttribute = mock(AttributeName.class);

        when(firstAttribute.getName()).thenReturn("first");
        when(firstAttribute.getChild()).thenReturn(null);
        when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
        when(attributeOrInt.getValue()).thenReturn(5);

        variableManager.calculate(attributeOrInt);

    }

    @Test
    public void GetValueUsingInvalidAttributeOrIntTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

        Object reference = variableManager.calculate(attributeOrInt);
        assertEquals(reference, 0);
    }

    @Test
    public void StoreUsingNameStringTest() {

        Object object = new Object();
        variableManager.store(null, "newName", object);

        assertEquals(object, variableManager.getReference(null, "newName"));
    }

    @Test
    public void StoreUsingPathTest() {
        Object object = new Object();
        List<String> path = Arrays.asList("first", "second", "third", "fourth");
        variableManager.store(path, object);

        assertEquals(object, variableManager.getReference(path));
    }

    @Test(expected = IllegalAccessError.class)
    public void StoreUsingInvalidPathTest() {

        List<String> path = new ArrayList<>();
        path.add("first");
        path.add("second");
        path.add("invalid");
        path.add("fourth");

        Object object = new Object();
        variableManager.store(path, object);
        assertEquals(object, variableManager.getReference(path));

    }

    @Test
    public void EvaluateBooleanExpTest() throws Exception {

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
    public void EvaluateAndExpTest() throws Exception {

        assertTrue(EvaluateAndExp(true, true));
        assertFalse(EvaluateAndExp(false, true));
        assertFalse(EvaluateAndExp(true, false));
        assertFalse(EvaluateAndExp(false, false));
    }

    @Test
    public void EvaluateOrExpTest() throws Exception {

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
    public void GetReferenceUsingPathTest() {

        List<String> path = new ArrayList<>();
        path.add("first");
        path.add("second");
        path.add("third");
        Object reference = variableManager.getReference(path);
        assertEquals(thirdObject, reference);
    }

    @Test(expected = IllegalAccessError.class)
    public void GetReferenceUsingInvalidPathTest() {

        List<String> path = new ArrayList<>();
        path.add("invalid");
        path.add("second");
        path.add("third");
        Object reference = variableManager.getReference(path);
        assertEquals(thirdObject, reference);
    }

    @Test
    public void GetReferenceUsingNameTest() {

        Object first = variableManager.getReference(null, "first");
        Object second = variableManager.getReference(firstObject, "second");
        assertEquals(firstObject, first);
        assertEquals(secondObject, second);
    }

    @Test(expected = IllegalAccessError.class)
    public void GetReferenceUsingInvalidNameTest() {

        variableManager.getReference(null, "invalid");
    }

    @Test
    public void GetReferenceUsingAttributeNameTest() {

        AttributeName firstAttribute = mock(AttributeName.class);
        AttributeName secondAttribute = mock(AttributeName.class);

        when(firstAttribute.getName()).thenReturn("first");
        when(firstAttribute.getChild()).thenReturn(secondAttribute);
        when(secondAttribute.getName()).thenReturn("second");
        when(secondAttribute.getChild()).thenReturn(null);

        Object reference = variableManager.getReference(firstAttribute);

        assertEquals(secondObject, reference);
    }

//getReference tests

    @Test(expected = IllegalAccessError.class)
    public void GetReferenceUsingInvalidAttributeNameTest() {

        AttributeName firstAttribute = mock(AttributeName.class);

        when(firstAttribute.getName()).thenReturn("invalid");
        when(firstAttribute.getChild()).thenReturn(null);

        variableManager.getReference(firstAttribute);
    }

    @Test
    public void GetReferenceUsingAttributeOrIntReturnsIntTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

        when(attributeOrInt.getAttribute()).thenReturn(null);
        when(attributeOrInt.getValue()).thenReturn(5);

        Object reference = variableManager.getReference(attributeOrInt);

        assertEquals(5, reference);
    }

    @Test
    public void GetReferenceUsingAttributeOrIntReturnsAttributeTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);
        AttributeName firstAttribute = mock(AttributeName.class);

        when(firstAttribute.getName()).thenReturn("first");
        when(firstAttribute.getChild()).thenReturn(null);
        when(attributeOrInt.getAttribute()).thenReturn(firstAttribute);
        when(attributeOrInt.getValue()).thenReturn(5);

        Object reference = variableManager.getReference(attributeOrInt);

        assertEquals(firstObject, reference);
        assertNotSame(5, reference);
    }

    @Test
    public void GetReferenceUsingInvalidAttributeOrIntTest() {

        AttributeOrInt attributeOrInt = mock(AttributeOrInt.class);

        Object reference = variableManager.getReference(attributeOrInt);
        assertEquals(0, reference);
    }

    private int GetValueUsingAdditionExp(int value1, int value2, String operator) {

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
            int value1, int value2, String operator) {

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
            String not, AttributeOrInt left, String operator, AttributeOrInt right) {

        BooleanExp booleanExp = mock(BooleanExp.class);

        when(booleanExp.getNot()).thenReturn(not);
        when(booleanExp.getName()).thenReturn(operator);
        when(booleanExp.getLeft()).thenReturn(left);
        when(booleanExp.getRight()).thenReturn(right);

        return variableManager.evaluate(booleanExp);
    }

    private boolean EvaluateAndExp(boolean left, boolean right) {

        VariableManager spy = spy(variableManager);

        BooleanExp booleanExp1 = mock(BooleanExp.class);
        BooleanExp booleanExp2 = mock(BooleanExp.class);
        AndExp andExp = mock(AndExp.class);
        EList<BooleanExp> booleanExps =
                new BasicEList<>(Arrays.asList(booleanExp1, booleanExp2));

        when(andExp.getExpressions()).thenReturn(booleanExps);

        doReturn(left).when(spy).evaluate(booleanExp1);
        doReturn(right).when(spy).evaluate(booleanExp2);

        return spy.evaluate(andExp);
    }

    private boolean EvaluateOrExp(boolean left, boolean right) {

        VariableManager spy = spy(variableManager);

        OrExp orExp = mock(OrExp.class);
        AndExp andExp1 = mock(AndExp.class);
        AndExp andExp2 = mock(AndExp.class);
        EList<AndExp> andExps = new BasicEList<>(Arrays.asList(andExp1, andExp2));

        when(orExp.getExpressions()).thenReturn(andExps);

        doReturn(left).when(spy).evaluate(andExp1);
        doReturn(right).when(spy).evaluate(andExp2);

        return spy.evaluate(orExp);
    }

}