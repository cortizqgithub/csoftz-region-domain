/*----------------------------------------------------------------------------*/
/* Source File:   MESSAGE.JAVA                                                */
/* Copyright (c), 2020 CSoftZ.                                                */
/*----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
 History
 Sep.27/2020  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.region.domain.province;

import lombok.Builder;
import lombok.Value;

/**
 * Representation of a Province in the region domain.
 *
 * @author COQ Carlos Adolfo Ortiz Q.
 * @version 1.1, Dec.12/2020
 * @since JDK 11, Sep.27/2020
 */
@Value
@Builder
public class Province {
    String continentCode;
    String countryCode;
    String code;
    String name;
    String description;
}
