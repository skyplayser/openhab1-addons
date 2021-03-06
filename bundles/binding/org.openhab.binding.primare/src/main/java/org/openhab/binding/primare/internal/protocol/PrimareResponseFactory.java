/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.primare.internal.protocol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract base class for Primare responses to be extended by model-specific
 * implementation classes
 * This class is used for converting Primare device messages received as byte streams
 * to PrimareReponse instances
 *
 * @author Veli-Pekka Juslin
 * @since 1.7.0
 */
public abstract class PrimareResponseFactory {

    private static final Logger logger = LoggerFactory.getLogger(PrimareResponseFactory.class);

    public abstract PrimareResponse getResponse(byte[] message);

}
