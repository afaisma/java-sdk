/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.util;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * Date serializer.
 */
public class DateSerializer implements JsonSerializer<Date> {
  private static final String DATE_FORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

  /*
   * (non-Javadoc)
   * 
   * @see com.google.gson.JsonSerializer#serialize(java.lang.Object, java.lang.reflect.Type,
   * com.google.gson.JsonSerializationContext)
   */
  @Override
  public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_UTC);
    return src == null ? null : new JsonPrimitive(sdf.format(src));
  }
}
