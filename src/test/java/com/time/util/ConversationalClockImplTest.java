package com.time.util;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 25/11/2012
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class ConversationalClockImplTest {

    private ConversationalClock conversationalClock = new ConversationalClockImpl();


    @Test
    public void shouldReturnConversationalTimeForTimesFromMidnightToNoon() {
//        assertThat(conversationalClock.getConversationalTime("00:00"), is("midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:01"), is("just after midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:02"), is("just after midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:03"), is("almost five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:12"), is("just after ten past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:13"), is("almost quarter past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:14"), is("almost quarter past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:15"), is("quarter past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:16"), is("just after quarter past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:17"), is("just after quarter past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:18"), is("almost twenty past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:19"), is("almost twenty past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:20"), is("twenty past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:21"), is("just after twenty past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:22"), is("just after twenty past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:23"), is("almost twenty five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:24"), is("almost twenty five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:25"), is("twenty five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:26"), is("just after twenty five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:27"), is("just after twenty five past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:28"), is("almost half past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:29"), is("almost half past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:30"), is("half past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:31"), is("just after half past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:32"), is("just after half past midnight"));
//        assertThat(conversationalClock.getConversationalTime("00:33"), is("almost twenty five to one"));
//        assertThat(conversationalClock.getConversationalTime("00:34"), is("almost twenty five to one"));
//
//        assertThat(conversationalClock.getConversationalTime("10:58"), is("almost eleven"));
//        assertThat(conversationalClock.getConversationalTime("10:59"), is("almost eleven"));
//        assertThat(conversationalClock.getConversationalTime("11:00"), is("eleven"));
//
        assertThat(conversationalClock.getConversationalTime("11:58"), is("almost noon"));
//        assertThat(conversationalClock.getConversationalTime("12:00"), is("noon"));
    }

    @Test
    public void shouldReturnConversationalTimeFromTimesFromNoonToMidnight() {
        assertThat(conversationalClock.getConversationalTime("13:00"), is("one"));
        assertThat(conversationalClock.getConversationalTime("13:01"), is("just after one"));
        assertThat(conversationalClock.getConversationalTime("13:34"), is("almost twenty five to two"));
        assertThat(conversationalClock.getConversationalTime("14:58"), is("almost three"));

        assertThat(conversationalClock.getConversationalTime("23:01"), is("just after eleven"));
        assertThat(conversationalClock.getConversationalTime("23:34"), is("almost twenty five to midnight"));
        assertThat(conversationalClock.getConversationalTime("23:58"), is("almost midnight"));
    }
}
