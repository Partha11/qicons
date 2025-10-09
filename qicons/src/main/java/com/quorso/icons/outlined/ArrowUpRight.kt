package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowUpRight: ImageVector
    get() {
        if (_ArrowUpRight != null) {
            return _ArrowUpRight!!
        }
        _ArrowUpRight = ImageVector.Builder(
            name = "Outlined.ArrowUpRight",
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
                moveToRelative(4.5f, 19.5f)
                lineToRelative(15f, -15f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.25f)
                moveToRelative(11.25f, 0f)
                verticalLineToRelative(11.25f)
            }
        }.build()

        return _ArrowUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRight: ImageVector? = null
