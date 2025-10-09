package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.AdjustmentsVertical: ImageVector
    get() {
        if (_AdjustmentsVertical != null) {
            return _AdjustmentsVertical!!
        }
        _AdjustmentsVertical = ImageVector.Builder(
            name = "Outlined.AdjustmentsVertical",
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
                moveTo(6f, 13.5f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 9.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveToRelative(0f, 3.75f)
                verticalLineTo(16.5f)
                moveToRelative(12f, -3f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 9.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveToRelative(0f, 3.75f)
                verticalLineTo(16.5f)
                moveToRelative(-6f, -9f)
                verticalLineTo(3.75f)
                moveToRelative(0f, 3.75f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                moveToRelative(0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                moveToRelative(0f, 9.75f)
                verticalLineTo(10.5f)
            }
        }.build()

        return _AdjustmentsVertical!!
    }

@Suppress("ObjectPropertyName")
private var _AdjustmentsVertical: ImageVector? = null
