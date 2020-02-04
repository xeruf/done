import xerus.ktutil.helpers.createPostConnection
import xerus.ktutil.helpers.post
import xerus.ktutil.printIt
import java.io.File
import java.net.URL

fun main() {
	val con = URL("https://api.todoist.com/sync/v8/sync").createPostConnection("token=a3d5b64e36fe9386cd96d3e21e6fc131721ad570", "sync_token=*", "resource_types=[\"projects\"]")
	con.inputStream.copyTo(File("build/result.json").outputStream())
}