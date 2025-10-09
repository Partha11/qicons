package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ArrowDownTray: ImageVector
    get() {
        if (_ArrowDownTray != null) {
            return _ArrowDownTray!!
        }
        _ArrowDownTray = ImageVector.Builder(
            name = "Outlined.ArrowDownTray",
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
                moveTo(3f, 16.5f)
                verticalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 21f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.75f)
                verticalLineTo(16.5f)
                moveTo(16.5f, 12f)
                lineTo(12f, 16.5f)
                moveToRelative(0f, 0f)
                lineTo(7.5f, 12f)
                moveToRelative(4.5f, 4.5f)
                verticalLineTo(3f)
            }
        }.build()

        return _ArrowDownTray!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownTray: ImageVector? = null
