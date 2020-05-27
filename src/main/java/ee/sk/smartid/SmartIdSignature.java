package ee.sk.smartid;

/*-
 * #%L
 * Smart ID sample Java client
 * %%
 * Copyright (C) 2018 SK ID Solutions AS
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import ee.sk.smartid.exception.TechnicalErrorException;
import org.apache.commons.codec.binary.Base64;

import java.io.Serializable;

public class SmartIdSignature implements Serializable {

  private String valueInBase64;
  private String algorithmName;
  private String documentNumber;
  private String interactionFlowUsed;

  public byte[] getValue() {
    if (!Base64.isBase64(valueInBase64)) {
      throw new TechnicalErrorException("Failed to parse signature value in base64. Probably incorrectly encoded base64 string: '" + valueInBase64);
    }
    return Base64.decodeBase64(valueInBase64);
  }

  public String getValueInBase64() {
    return valueInBase64;
  }

  public void setValueInBase64(String valueInBase64) {
    this.valueInBase64 = valueInBase64;
  }

  public String getAlgorithmName() {
    return algorithmName;
  }

  public void setAlgorithmName(String algorithmName) {
    this.algorithmName = algorithmName;
  }

  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public String getInteractionFlowUsed() {
    return interactionFlowUsed;
  }

  public void setInteractionFlowUsed(String interactionFlowUsed) {
    this.interactionFlowUsed = interactionFlowUsed;
  }

}
