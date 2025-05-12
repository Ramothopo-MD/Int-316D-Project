package za.ac.tut.Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2025-05-12T12:52:19")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> qualification;
    public static volatile SingularAttribute<Student, Date> dob;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> studentNo;
    public static volatile SingularAttribute<Student, Date> creationDate;

}