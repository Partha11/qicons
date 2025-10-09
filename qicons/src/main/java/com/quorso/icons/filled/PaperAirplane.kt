package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) {
            return _PaperAirplane!!
        }
        _PaperAirplane = ImageVector.Builder(
            name = "Filled.PaperAirplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.478f, 2.404f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.926f, 0.941f)
                lineToRelative(2.432f, 7.905f)
                horizontalLineTo(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineTo(4.984f)
                lineToRelative(-2.432f, 7.905f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.926f, 0.94f)
                arcToRelative(60.519f, 60.519f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.445f, -8.986f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.218f)
                arcTo(60.517f, 60.517f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.478f, 2.404f)
                close()
            }
        }.build()

        return _PaperAirplane!!
    }

@Suppress("ObjectPropertyName")
private var _PaperAirplane: ImageVector? = null
