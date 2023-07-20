package edu.depaul.cdm.se452.concept.base.school.complex;

import java.util.HashMap;

public class AddressRepository  {
    private static HashMap<Long, Address> ADDRESSES = new HashMap<Long, Address>();

    public Address save(Address course) {
        ADDRESSES.put(course.getId(), course);
        return course;
    }    

    public Address findById(Long id) {
        return ADDRESSES.get(id);
    }

    public Address findByName(String name) {
        Address retval = null;
        for(Address address : ADDRESSES.values()) {
            if (address.getLocation().equalsIgnoreCase(name)) {
                retval = address;
            }
        }
        return retval;
    }}