package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUturnUp: ImageVector
    get() {
        if (_ArrowUturnUp != null) {
            return _ArrowUturnUp!!
        }
        _ArrowUturnUp = ImageVector.Builder(
            name = "Outlined.ArrowUturnUp",
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
                moveToRelative(9f, 9f)
                lineToRelative(6f, -6f)
                moveToRelative(0f, 0f)
                lineToRelative(6f, 6f)
                moveToRelative(-6f, -6f)
                verticalLineToRelative(12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 0f)
                verticalLineToRelative(-3f)
            }
        }.build()

        return _ArrowUturnUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnUp: ImageVector? = null
