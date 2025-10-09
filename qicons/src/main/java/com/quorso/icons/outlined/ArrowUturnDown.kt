package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) {
            return _ArrowUturnDown!!
        }
        _ArrowUturnDown = ImageVector.Builder(
            name = "Outlined.ArrowUturnDown",
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
                moveToRelative(15f, 15f)
                lineToRelative(-6f, 6f)
                moveToRelative(0f, 0f)
                lineToRelative(-6f, -6f)
                moveToRelative(6f, 6f)
                verticalLineTo(9f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                verticalLineToRelative(3f)
            }
        }.build()

        return _ArrowUturnDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUturnDown: ImageVector? = null
