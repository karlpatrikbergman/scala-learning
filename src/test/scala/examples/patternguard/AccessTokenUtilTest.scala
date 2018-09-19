package examples.patternguard

import org.scalatest.FunSuite

class AccessTokenUtilTest extends FunSuite {

  test("Access token parameter is set and access token cookie is null should return correct log message") {
    assert(AccessTokenUtil.getAccessTokenLogMsg("_accessToken-1234", null) == AccessTokenUtil.AccessTokenParamIsSetAndAccessTokenCookieIsNull)
  }

  test("Access token parameter is null and access token cookie is set should return correct log message") {
    assert(AccessTokenUtil.getAccessTokenLogMsg(null, "access_token-1234") == AccessTokenUtil.AccessTokenParamIsNullAndAccessTokenCookieIsSet)
  }

  test("Access token parameter is set and access token cookie is set should return correct log message") {
    assert(AccessTokenUtil.getAccessTokenLogMsg("_accessToken-1234", "access_token-1234") == AccessTokenUtil.AccessTokenParamIsSetAndAccessTokenCookieIsSet)
  }

  test("access_token_parameter_is_null_and_access_token_cookie_is_null_should_return_correct_log_message") {
    println(AccessTokenUtil.getAccessTokenLogMsg(null, null))
    assert(AccessTokenUtil.getAccessTokenLogMsg(null, null) == AccessTokenUtil.AccessTokenParamIsNullAndAccessTokenCookieIsNull)
  }
}
