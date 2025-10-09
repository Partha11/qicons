package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.BookmarkSlash: ImageVector
    get() {
        if (_BookmarkSlash != null) {
            return _BookmarkSlash!!
        }
        _BookmarkSlash = ImageVector.Builder(
            name = "Filled.BookmarkSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(18f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-18f, -18f)
                close()
                moveTo(20.25f, 5.507f)
                verticalLineToRelative(11.561f)
                lineTo(5.853f, 2.671f)
                curveToRelative(0.15f, -0.043f, 0.306f, -0.075f, 0.467f, -0.094f)
                arcToRelative(49.255f, 49.255f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.36f, 0f)
                curveToRelative(1.497f, 0.174f, 2.57f, 1.46f, 2.57f, 2.93f)
                close()
                moveTo(3.75f, 21f)
                verticalLineTo(6.932f)
                lineToRelative(14.063f, 14.063f)
                lineTo(12f, 18.088f)
                lineToRelative(-7.165f, 3.583f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 21f)
                close()
            }
        }.build()

        return _BookmarkSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkSlash: ImageVector? = null
