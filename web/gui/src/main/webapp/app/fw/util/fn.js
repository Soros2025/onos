/*
 * Copyright 2014,2015 Open Networking Laboratory
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

/*
 ONOS GUI -- Util -- General Purpose Functions
 */
(function () {
    'use strict';

    var $window;

    function isF(f) {
        return typeof f === 'function' ? f : null;
    }

    function isA(a) {
        // NOTE: Array.isArray() is part of EMCAScript 5.1
        return Array.isArray(a) ? a : null;
    }

    function isS(s) {
        return typeof s === 'string' ? s : null;
    }

    function isO(o) {
        return (o && typeof o === 'object' && o.constructor === Object) ? o : null;
    }

    function contains(a, x) {
        return isA(a) && a.indexOf(x) > -1;
    }

    // Returns true if all names in the array are defined as functions
    // on the given api object; false otherwise.
    function areFunctions(api, fnNames) {
        if (!isA(fnNames)) {
            return false;
        }
        var n = fnNames.length,
            i, name;
        for (i=0; i<n; i++) {
            name = fnNames[i];
            if (!isF(api[name])) {
                return false;
            }
        }
        return true;
    }

    // Returns width and height of window inner dimensions.
    // offH, offW : offset width/height are subtracted, if present
    function windowSize(offH, offW) {
        var oh = offH || 0,
            ow = offW || 0;
        return {
            height: $window.innerHeight - oh,
            width: $window.innerWidth - ow
        };
    }

    angular.module('onosUtil')
        .factory('FnService', ['$window', function (_$window_) {
            $window = _$window_;

            return {
                isF: isF,
                isA: isA,
                isS: isS,
                isO: isO,
                contains: contains,
                areFunctions: areFunctions,
                windowSize: windowSize
            };
    }]);

}());
