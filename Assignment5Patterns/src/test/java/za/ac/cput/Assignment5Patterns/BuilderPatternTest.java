package za.ac.cput.Assignment5Patterns;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.AbstractFactoryMethod.DiplomaCourseDirector;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern.DiplomaCourse;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern.DiplomaCourseBuilder;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern.SecondYearDiplomaCourseBuilder;

/**
 * Created by student on 2015/03/13.
 */
public class BuilderPatternTest extends TestCase {
    @Test
            public void testBuilderPattern() throws Exception{

        DiplomaCourseBuilder diplomaCourseBuilder = new SecondYearDiplomaCourseBuilder();
        DiplomaCourseDirector diplomaCourseDirector = new DiplomaCourseDirector(diplomaCourseBuilder);
        diplomaCourseDirector.constructDiplomaCourse();
        DiplomaCourse diplomaCourse = diplomaCourseDirector.getDiplomaCourse();

        DiplomaCourseBuilder diploma_Course_Builder = new SecondYearDiplomaCourseBuilder();
        diplomaCourseDirector = new DiplomaCourseDirector(diplomaCourseBuilder);
        diplomaCourseDirector.constructDiplomaCourse();
        DiplomaCourse diplomaCourse1 = diplomaCourseDirector.getDiplomaCourse();

        Assert.assertEquals(diplomaCourse, diplomaCourse1);

    }


}
