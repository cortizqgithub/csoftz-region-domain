/*----------------------------------------------------------------------------*/
/* Source File:   MESSAGE.JAVA                                                */
/* Copyright (c), 2020 CSoftZ.                                                */
/*----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------
 History
 Sep.27/2020  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.region.domain.continent;

import lombok.Builder;
import lombok.Value;

/**
 * Representation of a continent in the region domain
 * <a href="https://datahub.io/core/continent-codes">Continent Codes</a>
 *
 * @author COQ Carlos Adolfo Ortiz Q.
 * @version 1.1, Dec.12/2020
 * @since JDK 11, Sep.27/2020
 */
@Value
@Builder
public class Continent {
    String code;
    String name;
}
