/*
 * Copyright 2016 Nibodha Technologies Pvt. Ltd.
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

package com.nibodha.agora.services.security.config;

import com.nibodha.agora.services.security.config.oauth2.OAuth2AuthorizationServerConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

/**
 * @author gibugeorge on 26/02/16.
 * @version 1.0
 */

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER)
@ConditionalOnMissingBean(value = OAuth2SecurityConfiguration.class)
@ImportResource("classpath*:META-INF/spring/digest-auth-context.xml")
public class DigestAuthenticationConfiguration {

}
