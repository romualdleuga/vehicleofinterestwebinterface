package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.VehicleMake;
import model.VehicleOfInterest;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-25T22:20:24")
@StaticMetamodel(VehicleModel.class)
public class VehicleModel_ { 

    public static volatile CollectionAttribute<VehicleModel, VehicleOfInterest> vehicleOfInterestCollection;
    public static volatile SingularAttribute<VehicleModel, String> model;
    public static volatile SingularAttribute<VehicleModel, VehicleMake> make;

}