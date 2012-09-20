/*
 * Copyright (C) 2012 Red Hat Inc.
 * 
 * This file is part of enforce-victims-rule for the Maven Enforcer Plugin.
 * enforce-victims-rule is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * enforce-victims-rule is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with enforce-victims-rule.  If not, see <http://www.gnu.org/licenses/>.  
 * 
 */

package com.redhat.victims;

/**
 * Generic wrapper for all exceptions that are thrown within this plugin. 
 * @author gmurphy
 */
public class VictimsException extends Exception {

    public VictimsException(String message){
        super(message);
    }
    
    public VictimsException(String message, Throwable e) {
        
        super(message, e);

    }
    
}
