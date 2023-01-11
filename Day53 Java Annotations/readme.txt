Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

Java annotation can be added to an element in the following way:

@Entity
Class DemoClass{
}
We can also set a value to the annotation member. For example:

@Entity(EntityName="DemoClass")
Class DemoClass{
}
In Java, there are several built-in annotations. You can also define your own annotations in the following way:

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
}
Here, we define an annotation , where  is the only member in that custom annotation. The  takes only  type values, and the default is “GUEST”. If we do not define the value for this annotation member, then it takes the default. By using @Target, we can specify where our annotation can be used. For example, the  annotation can only be used with the method in a class. @Retention defines whether the annotation is available at runtime. To learn more about Java annotation, you can read the tutorial and oracle docs.
