package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.BoltSlash: ImageVector
    get() {
        if (_BoltSlash != null) {
            return _BoltSlash!!
        }
        _BoltSlash = ImageVector.Builder(
            name = "Filled.BoltSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.798f, 11.012f)
                lineToRelative(-3.188f, 3.416f)
                lineTo(9.462f, 6.28f)
                lineToRelative(4.24f, -4.542f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.272f, 0.71f)
                lineTo(12.982f, 9.75f)
                horizontalLineToRelative(7.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.548f, 1.262f)
                close()
                moveTo(3.202f, 12.988f)
                lineTo(6.39f, 9.572f)
                lineToRelative(8.148f, 8.148f)
                lineToRelative(-4.24f, 4.542f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.272f, -0.71f)
                lineToRelative(1.992f, -7.302f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.548f, -1.262f)
                close()
                moveTo(3.53f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(18f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-18f, -18f)
                close()
            }
        }.build()

        return _BoltSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BoltSlash: ImageVector? = null
