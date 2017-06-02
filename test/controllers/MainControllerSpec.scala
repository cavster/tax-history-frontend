/*
 * Copyright 2017 HM Revenue & Customs
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

package controllers

import org.scalatest.mock.MockitoSugar
import play.api.test.FakeRequest
import services.TaiService
import uk.gov.hmrc.play.test.UnitSpec


class MainControllerSpec extends UnitSpec {

  trait LocalSetup {

    val fakeTaiService = MockitoSugar.mock[TaiService]

    val fakeRequest = FakeRequest("GET", "/")
    val c = new MainController(fakeTaiService)
  }

  "GET /tax-history-frontend" should {

//    "return 200" in new LocalSetup {
//      val result = c.index(fakeRequest)
//      status(result) shouldBe Status.OK
//    }
//
//    "return HTML" in new LocalSetup {
//      val result = c.index(fakeRequest)
//      contentType(result) shouldBe Some("text/plain")
//      charset(result) shouldBe Some("utf-8")
//    }

  }

}