/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.VehicleModel;

/**
 *
 * @author MacbookPro
 */
@Stateless
public class VehicleModelFacade extends AbstractFacade<VehicleModel> {

    @PersistenceContext(unitName = "VehiclesOfInterestWebServicesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehicleModelFacade() {
        super(VehicleModel.class);
    }
    
}
