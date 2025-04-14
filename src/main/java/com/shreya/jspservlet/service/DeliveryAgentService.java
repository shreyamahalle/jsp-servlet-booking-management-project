package com.shreya.jspservlet.service;
import com.shreya.jspservlet.model.DeliveryAgent;
import com.shreya.jspservlet.repository.DeliveryAgentRepository;
import java.sql.SQLException;
import java.util.List;

public class DeliveryAgentService  {
    private static final DeliveryAgentRepository deliveryAgentRepository = new DeliveryAgentRepository();

    public boolean insertDeliveryAgent(DeliveryAgent deliveryAgent) throws SQLException {
        if (deliveryAgentRepository.insertDeliveryAgent(deliveryAgent)) {
            System.out.println("DeliveryAgent created successfully");
        } else {
            System.out.println("failed to created DeliveryAgent");
            return false;
        }
        return true;
    }

    public List<DeliveryAgent> retrieveDeliveryAgents() throws SQLException {
        return deliveryAgentRepository.retrieveDeliveryAgents();
    }


}


