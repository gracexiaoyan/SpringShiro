/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.shiro.samples;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;


@Controller
public class LoginController {

    @RequestMapping("/login.html")
    public String loginTemplate() {

        return "login";
    }

    @RequestMapping("/")
    public void home(HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        response.sendRedirect("/login.html");
//        String name = "World";
//
//        Subject subject = SecurityUtils.getSubject();
//
//        PrincipalCollection principalCollection = subject.getPrincipals();
//
//        if (principalCollection != null && !principalCollection.isEmpty()) {
//            Collection<Map> principalMaps = subject.getPrincipals().byType(Map.class);
//            if (CollectionUtils.isEmpty(principalMaps)) {
//                name = subject.getPrincipal().toString();
//            }
//            else {
//                name = (String) principalMaps.iterator().next().get("username");
//            }
//            model.addAttribute("name", name);
//            response.sendRedirect("/account-info");
////            if(subject.hasRole("admin")){
////                System.out.println("This user has admin role");
////                response.sendRedirect("/account-info");
////            } else {
////                System.out.println("This user does not have admin role");
////                return "user";
////            }
//        }
//
//        model.addAttribute("name", name);
//        response.sendRedirect("/login.html");
//        return "login";
    }

}
