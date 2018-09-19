package examples.patternguard

object AccessTokenUtil {

  final val AccessTokenParamIsSetAndAccessTokenCookieIsNull = "Param access token (_accessToken) is set and cookie " +
   "access token (access_token) is null"
  final val AccessTokenParamIsNullAndAccessTokenCookieIsSet = "Param access token (_accessToken) is null and cookie " +
    "access token (access_token) is set"
  final val AccessTokenParamIsSetAndAccessTokenCookieIsSet = "Param access token (_accessToken) is set and cookie " +
    "access token (access_token) is set"
  final val AccessTokenParamIsNullAndAccessTokenCookieIsNull = "Param access token (_accessToken) is null and cookie " +
    "access token (access_token) is null"

  def getAccessTokenLogMsg(paramAccessToken: String, cookieAccessToken: String): String = (paramAccessToken, cookieAccessToken) match {
    case (_:String, null) => AccessTokenParamIsSetAndAccessTokenCookieIsNull
    case (null, _:String) => AccessTokenParamIsNullAndAccessTokenCookieIsSet
    case (_:String, _:String) => AccessTokenParamIsSetAndAccessTokenCookieIsSet
    case (null, null) => AccessTokenParamIsNullAndAccessTokenCookieIsNull
    case (_, _) => "Unknown case"
  }
}
