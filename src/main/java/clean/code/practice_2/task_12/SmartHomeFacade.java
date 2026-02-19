package clean.code.practice_2.task_12;

public class SmartHomeFacade {
    private ConditioningOperator conditioningOperator;
    private LightOperator lightOperator;
    private  SecuritySystemOperator securitySystemOperator;

    public SmartHomeFacade(ConditioningOperator conditioningOperator, LightOperator lightOperator,
                           SecuritySystemOperator securitySystemOperator) {
        this.conditioningOperator = conditioningOperator;
        this.lightOperator = lightOperator;
        this.securitySystemOperator = securitySystemOperator;
    }

    public void turnOnAllSystems() {
        conditioningOperator.onConditioning();
        lightOperator.turnOnAllTheLights();
        securitySystemOperator.onSecuritySystem();
        System.out.println();
    }

    public void turnOffAllSystems() {
        conditioningOperator.offConditioning();
        lightOperator.turnOffAllTheLights();
        securitySystemOperator.offSecuritySystem();
        System.out.println();
    }
}
