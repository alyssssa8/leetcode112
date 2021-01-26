public class FactoryGetPlanFactory {
    //use getPlan method to get object of type Plan
    public FactoryPlan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new FactoryDomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new FactoryCommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new FactoryInstitutionalPlan();
        }
        return null;
    }
}
