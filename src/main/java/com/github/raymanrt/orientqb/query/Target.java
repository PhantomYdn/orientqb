/*
 * Copyright 2015 Riccardo Tasso
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.raymanrt.orientqb.query;

import com.github.raymanrt.orientqb.util.Commons;

public class Target {

    public static final Target DEFAULT = new Target("V");

    private final String target;

    public Target(String target) {
        this.target = target;
    }

    public static Target target(String target) {
        return new Target(target);
    }

    public static Target target(String ... targets) {
        return new Target(Commons.arrayToString(targets));
    }

    public static Target cluster(int cluster) {
        return new Target("cluster:" + Integer.toString(cluster));
    }

    public static Target indexValues(String indexName) {
        return new Target("indexvalues:" + indexName);
    }

    public static Target indexValuesAsc(String indexName) {
        return new Target("indexvaluesasc:" + indexName);
    }

    public static Target indexValuesDesc(String indexName) {
        return new Target("indexvaluesdesc:" + indexName);
    }

    public static Target nested(Query query) {
        return new Target("(" + query.toString() + ")");
    }

    public String toString() {
        return this.target;
    }
}
