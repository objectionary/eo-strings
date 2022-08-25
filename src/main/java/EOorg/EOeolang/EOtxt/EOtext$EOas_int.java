/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2022 Objectionary.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * EO org.eolang.txt package.
 *
 * @since 0.0
 * @checkstyle PackageNameCheck (4 lines)
 */
package EOorg.EOeolang.EOtxt;

import org.eolang.AtComposite;
import org.eolang.Data;
import org.eolang.ExFailure;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * AS_INT.
 *
 * @checkstyle TypeNameCheck (5 lines)
 * @since 0.0
 */
@XmirObject(oname = "text.as-int")
public class EOtext$EOas_int extends PhDefault {

    /**
     * Ctor.
     *
     * @param sigma Sigma
     */
    public EOtext$EOas_int(final Phi sigma) {
        super(sigma);
        this.add(
            "φ",
            new AtComposite(
                this,
                rho -> {
                    final Phi text = rho.attr("ρ").get();
                    final String content = new Param(text, "s").strong(String.class);
                    final Long result;
                    try {
                        result = Long.parseLong(content);
                    } catch (final NumberFormatException ex) {
                        throw new ExFailure(ex.getMessage());
                    }
                    return new Data.ToPhi(result);
                }
            )
        );
    }

}

