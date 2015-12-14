package org.mvnsearch;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * hibernate base test
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-unit.xml"})
public abstract class HibernateAppBaseTest extends UnitilsJUnit4 {

}
