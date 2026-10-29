public class WrapperClassDemo
{
public static void main(String[]args)
{
int primitiveInt=100;
float primitiveFloat=25.75f;
char primitiveChar='A';
boolean primitiveBoolean=true;
Integer wrappedint=primitiveInt;
Float wrappedFloat=primitiveFloat;
Character wrappedChar=primitiveChar;
Boolean wrappedBoolean=primitiveBoolean;
System.out.println("Autoboxed Integer:"+wrappedInt);
System.out.println("Autoboxed Float:"+wrappedFloat);
System.out.println("Autoboxed Character:"+wrappedChar);
System.out.println("Autoboxed Boolean:"+wrappedBoolean);
int unboxedint=wrappedInt;
float unboxedFloat=wrappedFloat;
char unboxedChar=wrappedChar;
System.out.println("Unboxed Integer:"+unboxedInt);
System.out.println("Unboxed Float:"+unboxedFloat);
System.out.println("Unboxed Character:"+unboxedChar);
System.out.println("Unboxed Boolean:"+unboxedBoolean);
String intString="300";
Integer parsedint=Integer.parseInt(intString);
String floatString="75.25";
Float parsedFloat=Float.parseFloat(floatString);
String charString="c";
Character parsedChar=charString.charAt(0);
String booleanString="true";
Boolean parsedBoolean=Boolean.parseBoolean(booleanString);
System.out.println("Autoboxed Integer:"+parsedInt);
System.out.println("Autoboxed Float:"+parsedFloat);
System.out.println("Autoboxed Character:"+parsedChar);
System.out.println("Autoboxed Boolean:"+parsedBoolean);
}
}
