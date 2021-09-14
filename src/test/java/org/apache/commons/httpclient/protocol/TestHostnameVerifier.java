package org.apache.commons.httpclient.protocol;

import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLException;

public class TestHostnameVerifier {

    @Test
    public void testExtractCN() throws Exception {
        Assert.assertArrayEquals(new String[] {"blah"}, SSLProtocolSocketFactory.extractCNs("cn=blah, ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {"blah", "yada", "booh"}, SSLProtocolSocketFactory.extractCNs("cn=blah, cn=yada, cn=booh"));
        Assert.assertArrayEquals(new String[] {"blah"}, SSLProtocolSocketFactory.extractCNs("c = pampa ,  cn  =    blah    , ou = blah , o = blah"));
        Assert.assertArrayEquals(new String[] {"blah"}, SSLProtocolSocketFactory.extractCNs("cn=\"blah\", ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {"blah  blah"}, SSLProtocolSocketFactory.extractCNs("cn=\"blah  blah\", ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {"blah, blah"}, SSLProtocolSocketFactory.extractCNs("cn=\"blah, blah\", ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {"blah, blah"}, SSLProtocolSocketFactory.extractCNs("cn=blah\\, blah, ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {"blah"}, SSLProtocolSocketFactory.extractCNs("c = cn=uuh, cn=blah, ou=blah, o=blah"));
        Assert.assertArrayEquals(new String[] {""}, SSLProtocolSocketFactory.extractCNs("cn=   , ou=blah, o=blah"));
    }

    @Test(expected = SSLException.class)
    public void testExtractCNInvalid1() throws Exception {
        SSLProtocolSocketFactory.extractCNs("blah,blah");
    }

    @Test(expected = SSLException.class)
    public void testExtractCNInvalid2() throws Exception {
        SSLProtocolSocketFactory.extractCNs("cn,o=blah");
    }

}
