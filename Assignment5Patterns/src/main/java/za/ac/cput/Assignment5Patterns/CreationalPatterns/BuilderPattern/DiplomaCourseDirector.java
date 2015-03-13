package za.ac.cput.Assignment5Patterns.CreationalPatterns.AbstractFactoryMethod;

import za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern.DiplomaCourse;
import za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern.DiplomaCourseBuilder;

/**
 * Created by student on 2015/03/13.
 */
public class DiplomaCourseDirector {
    private DiplomaCourseBuilder diplomaCourseBuilder= null;
    public DiplomaCourseDirector(DiplomaCourseBuilder diplomaCourseBuilder) {
        this.diplomaCourseBuilder = diplomaCourseBuilder;
    }
    public void constructDiplomaCourse(){
        diplomaCourseBuilder.buildDevelopmentSoftware();
        diplomaCourseBuilder.buildInformationSystems();
        diplomaCourseBuilder.buildTechnicalPrograming();
        diplomaCourseBuilder.buildInternetPrograming();
    }
    public DiplomaCourse getDiplomaCourse() {
        return diplomaCourseBuilder.getDiplomaCourse();
    }

}
