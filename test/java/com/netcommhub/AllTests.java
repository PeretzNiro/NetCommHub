package com.netcommhub;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.netcommhub.client.ClientTest;
import com.netcommhub.client.ui.GUITest;
import com.netcommhub.client.ui.LoginHandlerTest;
import com.netcommhub.server.MockServerTest;

// Message test classes
import com.netcommhub.common.message.ActiveCheckTest;
import com.netcommhub.common.message.AuthRequestTest;
import com.netcommhub.common.message.CarrierTest;
import com.netcommhub.common.message.CoordinatorTest;
import com.netcommhub.common.message.CurrentCoordinatorTest;
import com.netcommhub.common.message.DisplayInfoTest;
import com.netcommhub.common.message.MemberDetailsTest;
import com.netcommhub.common.message.MemberDetailsUpdateTest;
import com.netcommhub.common.message.MessagesTest;
import com.netcommhub.common.message.NameAcceptedTest;
import com.netcommhub.common.message.NameRequestTest;
import com.netcommhub.common.message.RemoveIdsTest;
import com.netcommhub.common.message.UpdateMenuTest;
import com.netcommhub.common.message.UserLeftTest;

// Util test classes
import com.netcommhub.common.util.UniqueIdGeneratorTest;

@RunWith(Suite.class)
@SuiteClasses({
    // Client tests
    ClientTest.class,
    GUITest.class,
    LoginHandlerTest.class,
    
    // Server tests
    MockServerTest.class,
    // ServerTest.class, // Uncomment if ServerTest exists
    
    // Common message tests
    ActiveCheckTest.class,
    AuthRequestTest.class,
    CarrierTest.class,
    CoordinatorTest.class,
    CurrentCoordinatorTest.class,
    DisplayInfoTest.class,
    MemberDetailsTest.class,
    MemberDetailsUpdateTest.class,
    MessagesTest.class,
    NameAcceptedTest.class,
    NameRequestTest.class,
    RemoveIdsTest.class,
    UpdateMenuTest.class,
    UserLeftTest.class,
    
    // Common util tests
    UniqueIdGeneratorTest.class
})
public class AllTests {
    // This class remains empty, it's just a holder for the above annotations
}