package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-25T22:20:24")
@StaticMetamodel(ReasonForInterest.class)
public class ReasonForInterest_ { 

    public static volatile SingularAttribute<ReasonForInterest, String> reason;
    public static volatile CollectionAttribute<ReasonForInterest, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile SingularAttribute<ReasonForInterest, String> description;

}