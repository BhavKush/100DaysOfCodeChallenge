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
Here, we define an annotation , where  is the only member in that custom annotation. The  takes only  type values, and the default is “GUEST”. If we do not define the value for this annotation member, then it takes the default. By using @Target, we can specify where our annotation can be used. For example, the  annotation can only be used with the method in a class.
Here, we partially define an annotation,  and a class, . In this problem, we give the user role and the amount of money that a user spends as inputs. Based on the user role, you have to call the appropriate method in the  class. If the amount of money spent is over the budget limit for that user role, it prints Budget Limit Over.

Your task is to complete the  annotation and the  class so that the  class works perfectly with the defined constraints.

Note: You must complete the  incomplete lines in the editor. You are not allowed to change, delete or modify any other lines. To restore the original code, click on the top-left button on the editor and create a new buffer.

Input Format

The first line of input contains an integer  representing the total number of test cases. Each test case contains a string and an integer separated by a space on a single line in the following format:

UserRole MoneySpend
Constraints

Name contains only lowercase English letters.

Output Format

Based on the user role and budget outputs, output the contents of the certain method. If the amount of money spent is over the budget limit, then output Budget Limit Over.

Sample Input

3
SENIOR 75
JUNIOR 45
SENIOR 40
Sample Output

Senior Member
Spend: 75
Budget Left: 25
Junior Member
Spend: 45
Budget Left: 5
Senior Member
Spend: 40
Budget Left: 60
