package com.galvanize;

import java.util.List;

/**
 * Created by hemiola on 2/3/17.
 */
public interface Addressable {

    List<Address> getAddresses();

    void addAddress(Address addy);


}
