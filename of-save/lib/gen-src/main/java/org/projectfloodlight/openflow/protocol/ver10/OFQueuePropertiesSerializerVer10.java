// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver10;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFQueueProperties;
import org.jboss.netty.buffer.ChannelBuffer;
import com.google.common.hash.PrimitiveSink;

public class OFQueuePropertiesSerializerVer10 {

    public final static int NONE_VAL = 0x0;
    public final static int MIN_RATE_VAL = 0x1;

    public static OFQueueProperties readFrom(ChannelBuffer bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ChannelBuffer bb, OFQueueProperties e) {
        bb.writeInt(toWireValue(e));
    }

    public static void putTo(OFQueueProperties e, PrimitiveSink sink) {
        sink.putInt(toWireValue(e));
    }

    public static OFQueueProperties ofWireValue(int val) {
        switch(val) {
            case NONE_VAL:
                return OFQueueProperties.NONE;
            case MIN_RATE_VAL:
                return OFQueueProperties.MIN_RATE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFQueueProperties in version 1.0: " + val);
        }
    }


    public static int toWireValue(OFQueueProperties e) {
        switch(e) {
            case NONE:
                return NONE_VAL;
            case MIN_RATE:
                return MIN_RATE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFQueueProperties in version 1.0: " + e);
        }
    }

}