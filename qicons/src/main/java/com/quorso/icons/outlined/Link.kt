package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Outlined.Link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.19f, 8.688f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.242f, 7.244f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.364f, -6.364f)
                lineToRelative(1.757f, -1.757f)
                moveToRelative(13.35f, -0.622f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.364f, -6.364f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.242f, 7.244f)
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
