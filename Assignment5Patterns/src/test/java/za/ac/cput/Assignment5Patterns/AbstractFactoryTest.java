package za.ac.cput.Assignment5Patterns;

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.AbstractFactoryMethod.Subject;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.AbstractFactoryMethod.SubjectFactory;

/**
 * Created by student on 2015/03/13.
 */
public class AbstractFactoryTest extends TestCase{
    @Test
    public void testAbstractFactoryMethod() throws Exception {
        SubjectFactory subjectFactory = new SubjectFactory() {
            @Override
            public Subject getSubjectName(String subjectCode) {
                return null;
            }
        };

    }


}
