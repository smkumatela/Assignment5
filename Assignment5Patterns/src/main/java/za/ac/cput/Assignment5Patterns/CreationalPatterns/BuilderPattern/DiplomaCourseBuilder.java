package za.ac.cput.Assignment5Patterns.CreationalPatterns.BuilderPattern;

/**
 * Created by student on 2015/03/13.
 */
public interface DiplomaCourseBuilder {
    public void buildTechnicalPrograming();
    public void buildInformationSystems();
    public void buildInternetPrograming();
    public void buildDevelopmentSoftware();

    public DiplomaCourse getDiplomaCourse();

}
