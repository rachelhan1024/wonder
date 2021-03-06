package com.secretpal.model;

import org.apache.log4j.Logger;

public class SPSecretPal extends _SPSecretPal {
  private static Logger log = Logger.getLogger(SPSecretPal.class);

  public SPMembership giverMembership() {
    return event().group().membershipForPerson(giver());
  }

  public SPMembership receiverMembership() {
    return event().group().membershipForPerson(receiver());
  }
}
