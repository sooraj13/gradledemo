package com.example.demo.controller;


import com.example.demo.dto.Response;
import com.example.demo.models.Customer;
import com.example.demo.services.CustProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cust/profile")
@RestController
public class CustProfileController {

    @Autowired
    CustProfileService custProfileService;

    @GetMapping("/custId/{custId}")
    public Response getCustDetails(@PathVariable("custId") Long custId) {
        Response resp = new Response();
        Customer cust = custProfileService.getCustDetails(custId);
        if(cust != null){
            resp.setCust(cust);
            resp.setRespCode(200L);
            resp.setMsg("success");
         return resp;
     }
        resp.setRespCode(500L);
        resp.setMsg("failure");
        return resp;

    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer cust){

        return custProfileService.addCust(cust);

    }


    @PostMapping("/update")
    public Response updateCustomer(@RequestBody Customer cust){

        return custProfileService.updateCust(cust);

    }


    @PostMapping("/delete")
    public Response deleteCustomer(@RequestBody Customer cust){

        return custProfileService.deleteCust(cust);

    }










}
