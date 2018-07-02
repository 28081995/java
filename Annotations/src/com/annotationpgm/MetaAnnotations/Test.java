package com.annotationpgm.MetaAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME) // at what point- either at CLASS-only at class file
                                    //  SOURCE-retained only with source code,discarding at compile time
                                    //RUNTIME- available at runtime and we can fetch data
@Target(ElementType.METHOD)  //indicates at what level you want-TYPE(for class),METHOD,FIELD,CONSTRUCTOR

@interface MyAnnotation {
	String owner();
	String address();
	int shopNo();
}
class ShopClass {
	public void invite() {
	
			System.out.println("welcome to shop");		
}
}

class Subclass extends ShopClass {
	@MyAnnotation(owner=" aruna ",shopNo = 12,address = " RAJAJINAGAR")
public void info()
{
	try {
		System.out.println("shop information");
			 @SuppressWarnings("rawtypes")
			Class cls = this.getClass();
			 System.out.println(cls);
			 @SuppressWarnings("unchecked")
			Method mth = cls.getMethod("info");
			MyAnnotation annot=mth.getAnnotation(MyAnnotation.class);
			System.out.println(annot.shopNo()+annot.owner()+annot.address());
			/* Annotation[] anns = mth.getAnnotations();
			 for(Annotation an:anns){
			     System.out.println(an);*/
		
	} catch (NoSuchMethodException e) {
		e.printStackTrace();
	} catch (SecurityException e) {
		e.printStackTrace();
	} 
	
}
}
public class Test {
	public static void main(String[] args) {
		Subclass s = new Subclass();
		s.invite();
		s.info();
	}
}
